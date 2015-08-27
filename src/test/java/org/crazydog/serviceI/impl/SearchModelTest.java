package org.crazydog.serviceI.impl;

import org.crazydog.daoI.Basedao;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Iterator;
import java.util.List;

public class SearchModelTest {

	private SearchModel model;
    @Autowired
    private Basedao basedao;

	@Before
	public void before() {
		model = new SearchModel("李飞", "高中", "一审");
	}

	@Test
	public void testSearch() {
		System.out.println(model.advanceSearch());
        String hql = model.advanceSearch();
        List list =  basedao.find(hql);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
	}

}
