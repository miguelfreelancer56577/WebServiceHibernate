/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mangelt.movies.manager.dao;

import com.mangelt.movies.manager.model.Movie;
import com.mangelt.movies.manager.service.MovieService;
import com.mangelt.movies.manager.utileria.Conexion;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author SPPDF
 */
public class MovieDao implements MovieService{
    @Override
    public void createMovie(Movie movie){
        Session session = Conexion.session();
        session.beginTransaction();
        session.save(movie);
        session.getTransaction().commit();
    }
}
