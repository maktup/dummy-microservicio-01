package pe.com.capacitacion.controller;
 
import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import pe.com.capacitacion.bean.Persona;
import org.springframework.web.bind.annotation.*; 
 
/**
 * Micro01Controller
 * @author cguerra
 **/
 @RestController
 @RequestMapping( "/dummy-microservicio-01" )    
 public class Micro01Controller{
 
        private List<Persona> listaPersonas = null;
       
	   /**
	    * consultarPersonaPorId	
	    * @param  id
	    * @return List<Persona> 
	    **/
		@GetMapping( value="/get/personas/{id}", produces="application/json" )
		public List<Persona> consultarPersonaPorId( @PathVariable( "id" ) long id ){ 
			   System.out.println( "'consultarPersonaPorId': id=" + id );
    		
			   listaPersonas = new ArrayList<Persona>();
			   
			   this.listaPersonas.add( new Persona( 1, "PAOLO GUERRERO", 35, "CONSULTOR"   ) );
			   this.listaPersonas.add( new Persona( 2, "LUIS GUADALUPE", 40, "PROGRAMADOR" ) );
			   this.listaPersonas.add( new Persona( 3, "PEDRO SALAZAR",  30, "ARQUITECTO"  ) );			   
 	      	   					   
			   Persona objPersonaTemp = null;
			   
			   for( int i=0; i<listaPersonas.size(); i++  ) {
				    objPersonaTemp = listaPersonas.get( i ); 
				    
				    if( id == objPersonaTemp.getId() ){				    	
				    	
				    	this.listaPersonas.clear(); 
				    	this.listaPersonas.add( objPersonaTemp ); 
				    	
				    	return this.listaPersonas; 
				    }
			   }
			   
			   return this.listaPersonas; 
		} 
		
	   /**
	    * consultarPersonas	
	    * @return List<Persona> 
	    **/
		@GetMapping( value="/get/personas", produces="application/json" )  
		public List<Persona> consultarPersonas(){ 
			   System.out.println( "'consultarPersonas'" );
			   
			   listaPersonas = new ArrayList<Persona>(); 
			
			   this.listaPersonas.add( new Persona( 1, "PAOLO GUERRERO", 35, "CONSULTOR"   ) );
			   this.listaPersonas.add( new Persona( 2, "LUIS GUADALUPE", 40, "PROGRAMADOR" ) );
			   this.listaPersonas.add( new Persona( 3, "PEDRO SALAZAR",  30, "ARQUITECTO"  ) );				   
	      	 
			   return this.listaPersonas; 
		} 
		
 }

 