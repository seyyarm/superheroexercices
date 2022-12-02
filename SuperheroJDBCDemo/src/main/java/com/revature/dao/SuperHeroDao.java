package com.revature.dao;

import java.util.List;

import com.revature.model.Superhero;

public interface SuperHeroDao {
    // CRUD:
    Superhero save(Superhero superhero);
    public Superhero getById(int id);
    public List<Superhero> getAll();
    public Superhero updateSuperhero(Superhero superhero) ;
    public void deleteSuperhero(int id);

}
