package com.axelor.action.Test;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.axelor.data.ImportException;
import com.axelor.data.ImportTask;
import com.axelor.data.Importer;
import com.axelor.data.Listener;
import com.axelor.data.csv.CSVImporter;
import com.axelor.db.Model;
import com.google.inject.Inject;
import com.google.inject.Injector;


public class DemoTest {

	private Logger log = LoggerFactory.getLogger(getClass());
	
	@Inject
	private Injector injector;
	
	@Test
	public void testCsv() throws ClassNotFoundException {
		System.err.println("hello");
		final Importer importer = new CSVImporter("/var/home/axelor/Training/trainning/Training/Aop/action-demo/action-demo/modules/axelor-action/src/main/resources/data-init/input-config.xml");

		final List<Model> records = new ArrayList<>();
		final Map<String, Object> context = new HashMap<>();

		importer.addListener(new Listener() {
			@Override
			public void imported(Model bean) {
				log.info("Bean saved : {}(id={})", bean.getClass().getSimpleName(), bean.getId());
				records.add(bean);
			}

			@Override
			public void imported(Integer total, Integer success) {
				log.info("Record (total): " + total);
				log.info("Record (success): " + success);
			}

			@Override
			public void handle(Model bean, Exception e) {

			}
		});

		importer.run(new ImportTask() {

			@Override
			public void configure() throws IOException {
				// provide input data
				input("customers", new File("/var/home/axelor/Training/trainning/Training/Aop/action-demo/action-demo/modules/axelor-action/src/main/resources/data-init/input/customers.csv"));
				
				// input("sales", new File("sales.csv"));
			}

			@Override
			public boolean handle(ImportException exception) {
				log.error("Import error : " + exception);
				return false;
			}

			@Override
			public boolean handle(IOException e) {
				log.error("IOException error : " + e);
				return true;
			}
		});
	}

}
