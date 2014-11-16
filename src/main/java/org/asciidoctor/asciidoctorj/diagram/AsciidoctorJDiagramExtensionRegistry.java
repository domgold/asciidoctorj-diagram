package org.asciidoctor.asciidoctorj.diagram;import org.asciidoctor.Asciidoctor;import org.asciidoctor.extension.RubyExtensionRegistry;import org.asciidoctor.extension.spi.ExtensionRegistry;/** * Registers Asciidoctor Diagram extension. * @author domgold * */public class AsciidoctorJDiagramExtensionRegistry implements ExtensionRegistry {	public AsciidoctorJDiagramExtensionRegistry() {	}	/*	 * (non-Javadoc)	 * 	 * @see	 * org.asciidoctor.extension.spi.ExtensionRegistry#register(org.asciidoctor	 * .Asciidoctor)	 */	@Override	public void register(Asciidoctor asciidoctor) {		RubyExtensionRegistry rubyExtensionRegistry = asciidoctor				.rubyExtensionRegistry();		rubyExtensionRegistry				.loadClass(this						.getClass()						.getResourceAsStream(								"/gems/asciidoctor-diagram-1.2.1-java/lib/asciidoctor-diagram.rb"));	}}