package com.guitarstore.guitar;

import com.guitarstore.guitar.model.Guitar;
import com.guitarstore.guitar.web.controller.GuitarController;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GuitarApplicationTests {

	@Test
	public void contextLoads() {
	}

	/**
	 * Guitar Controller
	 */
	@Autowired
	GuitarController guitarController;

	/**
	 * Find All Guitars Test
	 */
	@Test
	public void findGuitarsTest() {
		MappingJacksonValue guitars = guitarController.getGuitars();
		final String guitarsStr = guitars.toString();
		Assert.assertNotNull(guitarsStr);
	}

	/**
	 * Show One Guitar Test
	 */
	@Test
	public void showOneGuitarTest() {
		MappingJacksonValue guitar = guitarController.showOneGuitar(1);
		final String guitarStr = guitar.toString();
		Assert.assertNotNull(guitarStr);
	}

	/**
	 * Search Guitar by Name Like Test
	 */
	@Test
	public void searchGuitarByNametest() {
		List<Guitar> guitars = guitarController.searchGuitarByName("P");
		Assert.assertNotNull(guitars);
	}
}
