package com.javahelps.restservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javahelps.restservice.entity.Classe;
import com.javahelps.restservice.repository.ClasseRepository;

import javassist.tools.web.BadHttpRequest;

@RestController
@RequestMapping(path = "/classi")
public class ClasseController
{
    @Autowired
    private ClasseRepository repository;

    @GetMapping
    public Iterable<Classe> findAll()
    {
        return repository.findAll();
    }

    @GetMapping(path = "?id={id}")
    public Classe find(@PathVariable("id") Integer id)
    {
        return repository.getOne(id.toString());
    }

    @PostMapping(consumes = "application/json")
    public Classe create(@RequestBody Classe classe)
    {
        return repository.save(classe);
    }

    @DeleteMapping(path = "?id={id}")
    public void delete(@PathVariable("id") Integer id)
    {
        repository.delete(id.toString());
    }

    @PutMapping(path = "?id={id}")
    public Classe update(@PathVariable("id") Integer id, @RequestBody Classe classe) throws BadHttpRequest
    {
        if (repository.exists(id.toString()))
        {
            classe.setId(id);
            return repository.save(classe);
        }
        else
        {
            throw new BadHttpRequest();
        }
    }
}