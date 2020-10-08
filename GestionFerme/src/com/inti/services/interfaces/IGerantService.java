package com.inti.services.interfaces;

import com.inti.entities.Gerant;

public interface IGerantService {

	Object findWithLoginAndPassword(String login, String password);

	Object findAll(Class<Gerant> class1);


}
