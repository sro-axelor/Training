package com.axelor.Dependencyclass;

import javax.persistence.EntityManager;

import com.axelor.Entityclass.Game;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import com.google.inject.persist.Transactional;

/*@Singleton*/
public class GameCreate {

	@Inject
	private EntityManager em;

	@Transactional
	public void get() {
		em.persist(new Game(4,"freefire",800));
	}
}
