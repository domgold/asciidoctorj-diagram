/**
 * 
 */
package org.asciidoctor.asciidoctorj.diagram;

import org.asciidoctor.Asciidoctor;
import org.junit.Test;

/**
 * @author domgold
 *
 */
public class AsciidoctorJDiagramExtensionRegistryImplTest {

	/**
	 * Test method for {@link org.asciidoctor.asciidoctorj.diagram.AsciidoctorJDiagramExtensionRegistry#register(org.asciidoctor.Asciidoctor)}.
	 */
	@Test
	public void testRegister() {
		Asciidoctor asciidoctor = Asciidoctor.Factory.create();
		AsciidoctorJDiagramExtensionRegistry reg = new AsciidoctorJDiagramExtensionRegistry();
		reg.register(asciidoctor);
	}

}
