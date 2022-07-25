package com.db;
import com.db.exceptions.InvalidInputException;

import java.util.List;
public interface IAirports {


    List<String> findAirportBy(String str) throws InvalidInputException;
}

