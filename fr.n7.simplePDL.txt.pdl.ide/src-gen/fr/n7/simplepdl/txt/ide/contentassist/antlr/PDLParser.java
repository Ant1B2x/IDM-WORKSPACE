/*
 * generated by Xtext 2.23.0
 */
package fr.n7.simplepdl.txt.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import fr.n7.simplepdl.txt.ide.contentassist.antlr.internal.InternalPDLParser;
import fr.n7.simplepdl.txt.services.PDLGrammarAccess;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class PDLParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(PDLGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, PDLGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getProcessElementAccess().getAlternatives(), "rule__ProcessElement__Alternatives");
			builder.put(grammarAccess.getWorkSequenceTypeAccess().getAlternatives(), "rule__WorkSequenceType__Alternatives");
			builder.put(grammarAccess.getProcessAccess().getGroup(), "rule__Process__Group__0");
			builder.put(grammarAccess.getWorkDefinitionAccess().getGroup(), "rule__WorkDefinition__Group__0");
			builder.put(grammarAccess.getGuidanceAccess().getGroup(), "rule__Guidance__Group__0");
			builder.put(grammarAccess.getGuidanceAccess().getGroup_2(), "rule__Guidance__Group_2__0");
			builder.put(grammarAccess.getGuidanceAccess().getGroup_2_2(), "rule__Guidance__Group_2_2__0");
			builder.put(grammarAccess.getWorkSequenceAccess().getGroup(), "rule__WorkSequence__Group__0");
			builder.put(grammarAccess.getNeedAccess().getGroup(), "rule__Need__Group__0");
			builder.put(grammarAccess.getResourceAccess().getGroup(), "rule__Resource__Group__0");
			builder.put(grammarAccess.getProcessAccess().getNameAssignment_1(), "rule__Process__NameAssignment_1");
			builder.put(grammarAccess.getProcessAccess().getProcessElementsAssignment_3(), "rule__Process__ProcessElementsAssignment_3");
			builder.put(grammarAccess.getWorkDefinitionAccess().getNameAssignment_1(), "rule__WorkDefinition__NameAssignment_1");
			builder.put(grammarAccess.getWorkDefinitionAccess().getNeedAssignment_3(), "rule__WorkDefinition__NeedAssignment_3");
			builder.put(grammarAccess.getGuidanceAccess().getTextAssignment_1(), "rule__Guidance__TextAssignment_1");
			builder.put(grammarAccess.getGuidanceAccess().getElementsAssignment_2_1(), "rule__Guidance__ElementsAssignment_2_1");
			builder.put(grammarAccess.getGuidanceAccess().getElementsAssignment_2_2_1(), "rule__Guidance__ElementsAssignment_2_2_1");
			builder.put(grammarAccess.getWorkSequenceAccess().getLinkTypeAssignment_1(), "rule__WorkSequence__LinkTypeAssignment_1");
			builder.put(grammarAccess.getWorkSequenceAccess().getPredecessorAssignment_3(), "rule__WorkSequence__PredecessorAssignment_3");
			builder.put(grammarAccess.getWorkSequenceAccess().getSuccessorAssignment_5(), "rule__WorkSequence__SuccessorAssignment_5");
			builder.put(grammarAccess.getNeedAccess().getNbResourcesAssignment_1(), "rule__Need__NbResourcesAssignment_1");
			builder.put(grammarAccess.getNeedAccess().getResourceAssignment_3(), "rule__Need__ResourceAssignment_3");
			builder.put(grammarAccess.getResourceAccess().getNbAvailableResourcesAssignment_1(), "rule__Resource__NbAvailableResourcesAssignment_1");
			builder.put(grammarAccess.getResourceAccess().getNameAssignment_3(), "rule__Resource__NameAssignment_3");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private PDLGrammarAccess grammarAccess;

	@Override
	protected InternalPDLParser createParser() {
		InternalPDLParser result = new InternalPDLParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public PDLGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(PDLGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
