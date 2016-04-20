package work.manage;


import java.util.Set;
import javax.ejb.Singleton;
import javax.ejb.Stateful;
import javax.ws.rs.core.Application;

@javax.ws.rs.ApplicationPath("bubblewrappeddynamite")
public class ApplicationConfig extends Application{
	@Override
	public Set<Class<?>>getClasses(){
		return getRestResourceClasses();
	}
	
	public Set<Class<?>> getRestResourceClasses() {
		Set<Class<?>> resources = new java.util.HashSet<Class<?>>();
		resources.add(work.manage.HTTPMethodRegisters.class);
		//resources.add(work.manage.WebServiceNo2.class);
		return resources;
	}

}
