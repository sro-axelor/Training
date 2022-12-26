package com.axelor.action.Test;

import java.util.EnumSet;

import org.eclipse.osgi.container.Module;
import org.eclipse.osgi.container.ModuleContainer;
import org.eclipse.osgi.container.ModuleRevision;
import org.osgi.framework.Bundle;

public class DataModule extends Module{

	public DataModule(Long id, String location, ModuleContainer container, EnumSet<Settings> settings, int startlevel) {
		super(id, location, container, settings, startlevel);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Bundle getBundle() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected void cleanup(ModuleRevision arg0) {
		// TODO Auto-generated method stub
		
	}

}
