package com.cab.service;

import java.util.List;

import com.cab.exceptions.CabException;
import com.cab.exceptions.DriverException;
import com.cab.exceptions.LogInException;
import com.cab.model.Cab;
import com.cab.model.Driver;

public interface CabService {

	public Cab registerCab(Cab cab)throws DriverException;
	
	public Cab updateCab(String Key,Integer cabId,Cab cab)throws DriverException,LogInException;
	
	public List<Cab> getAllCabs(String key) throws DriverException, LogInException;
	
	public Cab deleteCab(String Key,Integer cabId)throws DriverException,LogInException;
	
    public Driver viewDriverByCabId(String key, Integer cabId) throws CabException, LogInException;
	
}
