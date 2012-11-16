package gov.va.scheduling.transformer;

import org.mule.api.transformer.TransformerException;
import org.mule.transformer.AbstractTransformer;

public class TestTransformer extends AbstractTransformer {
	
	@Override
	protected Object doTransform(Object src, String enc)
			throws TransformerException {
		// TODO Auto-generated method stub
		return new String("test");
	}

	
}
