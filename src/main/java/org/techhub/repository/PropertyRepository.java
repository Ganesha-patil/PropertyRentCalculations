package org.techhub.repository;

import java.util.List;
import org.techhub.model.PropertyModel;
public interface PropertyRepository {

	public boolean isSaveProperty (PropertyModel model);
	public List<PropertyModel> getAllProperties();
	public PropertyModel updateProperty (PropertyModel model);
	public boolean isDeleteProperty(int propId);
}

