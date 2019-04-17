package fr.afcepf.al33.tp.test;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import fr.afcepf.al33.tp.entity.Client;
import fr.afcepf.al33.tp.service.ServiceClient;

@RunWith(SpringJUnit4ClassRunner.class) //n�cessite spring-test et junit 4.12 dans pom.xml
@ContextConfiguration(locations={"/springConf.xml"})
public class TestServiceClient {
	
	@Autowired
	private ServiceClient serviceClient; //� tester
	
	@Test
	public void testClient() {
		Client c1=new Client();c1.setNom("toto");
		serviceClient.saveOrUpdateClient(c1);
        Client c1Relu = serviceClient.rechercherClientParNumero(c1.getNumero());
        System.out.println("c1Relu=" + c1Relu);
        Assert.assertTrue("toto".equals(c1Relu.getNom()));
	}

	
	
	
	
	
	
	
}
