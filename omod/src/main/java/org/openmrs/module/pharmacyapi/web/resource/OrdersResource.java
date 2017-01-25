package org.openmrs.module.pharmacyapi.web.resource;

import org.openmrs.Order;
import org.openmrs.module.webservices.rest.web.RestConstants;
import org.openmrs.module.webservices.rest.web.annotation.Resource;
import org.openmrs.module.webservices.rest.web.representation.Representation;
import org.openmrs.module.webservices.rest.web.resource.impl.BaseDelegatingReadableResource;
import org.openmrs.module.webservices.rest.web.resource.impl.DelegatingResourceDescription;

@Resource(name = RestConstants.VERSION_1 + "/orders", order = 1, supportedClass = Order.class, supportedOpenmrsVersions = {
        "1.8.*", "1.9.*", "1.10.*", "1.11.*", "1.12.*" })
public class OrdersResource extends BaseDelegatingReadableResource<Order> {
	
	@Override
	public Order newDelegate() {
		return null;
	}
	
	@Override
	public Order getByUniqueId(final String uuid) {
		return null;
	}
	
	@Override
	public DelegatingResourceDescription getRepresentationDescription(final Representation representation) {
		return null;
	}
}
