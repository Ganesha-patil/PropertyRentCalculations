package org.techhub.service;

import java.util.List;

import org.techhub.model.PropertyModel;

public interface PropertyService {

	public boolean isSaveProperty (PropertyModel model);
	public List<PropertyModel> getAllProperties();
	public PropertyModel updateProperty (PropertyModel model);
	public boolean isDeleteProperty(int propId);
}
