package edu.upc.eetac.dsa.csanchez.beeter2.api.model;

import java.util.List;

import javax.ws.rs.core.Link;
 
import org.glassfish.jersey.linking.InjectLink;
import org.glassfish.jersey.linking.InjectLink.Style;
import org.glassfish.jersey.linking.InjectLinks;

import edu.upc.eetac.dsa.csanchez.beeter2.api.BeeterRootAPIResource;
import edu.upc.eetac.dsa.csanchez.beeter2.api.MediaType;
import edu.upc.eetac.dsa.csanchez.beeter2.api.StingResource;




	
	public class BeeterRootAPI {
		@InjectLinks({
	            @InjectLink(resource = BeeterRootAPIResource.class, style = Style.ABSOLUTE, rel = "self bookmark home", title = "Beeter Root API"),
	            @InjectLink(resource = StingResource.class, style = Style.ABSOLUTE, rel = "collection", title = "Latest stings", type = MediaType.BEETER_API_STING_COLLECTION),
	            @InjectLink(resource = StingResource.class, style = Style.ABSOLUTE, rel = "create-sting", title = "Create new sting", type = MediaType.BEETER_API_STING)})
	    	private List<Link> links;
	 
		public List<Link> getLinks() {
			return links;
		}
	 
		public void setLinks(List<Link> links) {
			this.links = links;
		}
	}
	
	/*primer enlace: TODOS los enlaces siempre absolutos 
	 * http://ip_port/beeter2-api
	 * segundo y tercer enlace: http://ip_port/beeter2-api/stings
	 * 
	 * */


