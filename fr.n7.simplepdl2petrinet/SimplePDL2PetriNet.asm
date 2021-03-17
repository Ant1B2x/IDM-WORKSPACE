<?xml version = '1.0' encoding = 'ISO-8859-1' ?>
<asm version="1.0" name="0">
	<cp>
		<constant value="SimplePDL2PetriNet"/>
		<constant value="links"/>
		<constant value="NTransientLinkSet;"/>
		<constant value="col"/>
		<constant value="J"/>
		<constant value="main"/>
		<constant value="A"/>
		<constant value="OclParametrizedType"/>
		<constant value="#native"/>
		<constant value="Collection"/>
		<constant value="J.setName(S):V"/>
		<constant value="OclSimpleType"/>
		<constant value="OclAny"/>
		<constant value="J.setElementType(J):V"/>
		<constant value="TransientLinkSet"/>
		<constant value="A.__matcher__():V"/>
		<constant value="A.__exec__():V"/>
		<constant value="self"/>
		<constant value="__resolve__"/>
		<constant value="1"/>
		<constant value="J.oclIsKindOf(J):B"/>
		<constant value="18"/>
		<constant value="NTransientLinkSet;.getLinkBySourceElement(S):QNTransientLink;"/>
		<constant value="J.oclIsUndefined():B"/>
		<constant value="15"/>
		<constant value="NTransientLink;.getTargetFromSource(J):J"/>
		<constant value="17"/>
		<constant value="30"/>
		<constant value="Sequence"/>
		<constant value="2"/>
		<constant value="A.__resolve__(J):J"/>
		<constant value="QJ.including(J):QJ"/>
		<constant value="QJ.flatten():QJ"/>
		<constant value="e"/>
		<constant value="value"/>
		<constant value="resolveTemp"/>
		<constant value="S"/>
		<constant value="NTransientLink;.getNamedTargetFromSource(JS):J"/>
		<constant value="name"/>
		<constant value="__matcher__"/>
		<constant value="A.__matchProcess2PetriNet():V"/>
		<constant value="A.__matchWorkDefinition2PetriNet():V"/>
		<constant value="__exec__"/>
		<constant value="Process2PetriNet"/>
		<constant value="NTransientLinkSet;.getLinksByRule(S):QNTransientLink;"/>
		<constant value="A.__applyProcess2PetriNet(NTransientLink;):V"/>
		<constant value="WorkDefinition2PetriNet"/>
		<constant value="A.__applyWorkDefinition2PetriNet(NTransientLink;):V"/>
		<constant value="getProcess"/>
		<constant value="Msimplepdl!ProcessElement;"/>
		<constant value="Process"/>
		<constant value="simplepdl"/>
		<constant value="J.allInstances():J"/>
		<constant value="processElements"/>
		<constant value="0"/>
		<constant value="J.includes(J):J"/>
		<constant value="B.not():B"/>
		<constant value="CJ.including(J):CJ"/>
		<constant value="J.asSequence():J"/>
		<constant value="J.first():J"/>
		<constant value="12:2-12:19"/>
		<constant value="12:2-12:34"/>
		<constant value="13:16-13:17"/>
		<constant value="13:16-13:33"/>
		<constant value="13:44-13:48"/>
		<constant value="13:16-13:49"/>
		<constant value="12:2-13:50"/>
		<constant value="12:2-14:17"/>
		<constant value="12:2-14:26"/>
		<constant value="p"/>
		<constant value="__matchProcess2PetriNet"/>
		<constant value="IN"/>
		<constant value="MMOF!Classifier;.allInstancesFrom(S):QJ"/>
		<constant value="TransientLink"/>
		<constant value="NTransientLink;.setRule(MATL!Rule;):V"/>
		<constant value="NTransientLink;.addSourceElement(SJ):V"/>
		<constant value="pn"/>
		<constant value="PetriNet"/>
		<constant value="petrinet"/>
		<constant value="NTransientLink;.addTargetElement(SJ):V"/>
		<constant value="NTransientLinkSet;.addLink2(NTransientLink;B):V"/>
		<constant value="19:5-19:43"/>
		<constant value="__applyProcess2PetriNet"/>
		<constant value="NTransientLink;"/>
		<constant value="NTransientLink;.getSourceElement(S):J"/>
		<constant value="NTransientLink;.getTargetElement(S):J"/>
		<constant value="3"/>
		<constant value="19:36-19:37"/>
		<constant value="19:36-19:42"/>
		<constant value="19:28-19:42"/>
		<constant value="link"/>
		<constant value="__matchWorkDefinition2PetriNet"/>
		<constant value="WorkDefinition"/>
		<constant value="wd"/>
		<constant value="p_ready"/>
		<constant value="Place"/>
		<constant value="p_started"/>
		<constant value="27:3-30:33"/>
		<constant value="31:3-34:33"/>
		<constant value="__applyWorkDefinition2PetriNet"/>
		<constant value="4"/>
		<constant value="_ready"/>
		<constant value="J.+(J):J"/>
		<constant value="marking"/>
		<constant value="J.getProcess():J"/>
		<constant value="_started"/>
		<constant value="28:13-28:15"/>
		<constant value="28:13-28:20"/>
		<constant value="28:23-28:31"/>
		<constant value="28:13-28:31"/>
		<constant value="28:5-28:31"/>
		<constant value="29:16-29:17"/>
		<constant value="29:5-29:17"/>
		<constant value="30:17-30:19"/>
		<constant value="30:17-30:32"/>
		<constant value="30:5-30:32"/>
		<constant value="32:13-32:15"/>
		<constant value="32:13-32:20"/>
		<constant value="32:23-32:33"/>
		<constant value="32:13-32:33"/>
		<constant value="32:5-32:33"/>
		<constant value="33:16-33:17"/>
		<constant value="33:5-33:17"/>
		<constant value="34:17-34:19"/>
		<constant value="34:17-34:32"/>
		<constant value="34:5-34:32"/>
	</cp>
	<field name="1" type="2"/>
	<field name="3" type="4"/>
	<operation name="5">
		<context type="6"/>
		<parameters>
		</parameters>
		<code>
			<getasm/>
			<push arg="7"/>
			<push arg="8"/>
			<new/>
			<dup/>
			<push arg="9"/>
			<pcall arg="10"/>
			<dup/>
			<push arg="11"/>
			<push arg="8"/>
			<new/>
			<dup/>
			<push arg="12"/>
			<pcall arg="10"/>
			<pcall arg="13"/>
			<set arg="3"/>
			<getasm/>
			<push arg="14"/>
			<push arg="8"/>
			<new/>
			<set arg="1"/>
			<getasm/>
			<pcall arg="15"/>
			<getasm/>
			<pcall arg="16"/>
		</code>
		<linenumbertable>
		</linenumbertable>
		<localvariabletable>
			<lve slot="0" name="17" begin="0" end="24"/>
		</localvariabletable>
	</operation>
	<operation name="18">
		<context type="6"/>
		<parameters>
			<parameter name="19" type="4"/>
		</parameters>
		<code>
			<load arg="19"/>
			<getasm/>
			<get arg="3"/>
			<call arg="20"/>
			<if arg="21"/>
			<getasm/>
			<get arg="1"/>
			<load arg="19"/>
			<call arg="22"/>
			<dup/>
			<call arg="23"/>
			<if arg="24"/>
			<load arg="19"/>
			<call arg="25"/>
			<goto arg="26"/>
			<pop/>
			<load arg="19"/>
			<goto arg="27"/>
			<push arg="28"/>
			<push arg="8"/>
			<new/>
			<load arg="19"/>
			<iterate/>
			<store arg="29"/>
			<getasm/>
			<load arg="29"/>
			<call arg="30"/>
			<call arg="31"/>
			<enditerate/>
			<call arg="32"/>
		</code>
		<linenumbertable>
		</linenumbertable>
		<localvariabletable>
			<lve slot="2" name="33" begin="23" end="27"/>
			<lve slot="0" name="17" begin="0" end="29"/>
			<lve slot="1" name="34" begin="0" end="29"/>
		</localvariabletable>
	</operation>
	<operation name="35">
		<context type="6"/>
		<parameters>
			<parameter name="19" type="4"/>
			<parameter name="29" type="36"/>
		</parameters>
		<code>
			<getasm/>
			<get arg="1"/>
			<load arg="19"/>
			<call arg="22"/>
			<load arg="19"/>
			<load arg="29"/>
			<call arg="37"/>
		</code>
		<linenumbertable>
		</linenumbertable>
		<localvariabletable>
			<lve slot="0" name="17" begin="0" end="6"/>
			<lve slot="1" name="34" begin="0" end="6"/>
			<lve slot="2" name="38" begin="0" end="6"/>
		</localvariabletable>
	</operation>
	<operation name="39">
		<context type="6"/>
		<parameters>
		</parameters>
		<code>
			<getasm/>
			<pcall arg="40"/>
			<getasm/>
			<pcall arg="41"/>
		</code>
		<linenumbertable>
		</linenumbertable>
		<localvariabletable>
			<lve slot="0" name="17" begin="0" end="3"/>
		</localvariabletable>
	</operation>
	<operation name="42">
		<context type="6"/>
		<parameters>
		</parameters>
		<code>
			<getasm/>
			<get arg="1"/>
			<push arg="43"/>
			<call arg="44"/>
			<iterate/>
			<store arg="19"/>
			<getasm/>
			<load arg="19"/>
			<pcall arg="45"/>
			<enditerate/>
			<getasm/>
			<get arg="1"/>
			<push arg="46"/>
			<call arg="44"/>
			<iterate/>
			<store arg="19"/>
			<getasm/>
			<load arg="19"/>
			<pcall arg="47"/>
			<enditerate/>
		</code>
		<linenumbertable>
		</linenumbertable>
		<localvariabletable>
			<lve slot="1" name="33" begin="5" end="8"/>
			<lve slot="1" name="33" begin="15" end="18"/>
			<lve slot="0" name="17" begin="0" end="19"/>
		</localvariabletable>
	</operation>
	<operation name="48">
		<context type="49"/>
		<parameters>
		</parameters>
		<code>
			<push arg="28"/>
			<push arg="8"/>
			<new/>
			<push arg="50"/>
			<push arg="51"/>
			<findme/>
			<call arg="52"/>
			<iterate/>
			<store arg="19"/>
			<load arg="19"/>
			<get arg="53"/>
			<load arg="54"/>
			<call arg="55"/>
			<call arg="56"/>
			<if arg="26"/>
			<load arg="19"/>
			<call arg="57"/>
			<enditerate/>
			<call arg="58"/>
			<call arg="59"/>
		</code>
		<linenumbertable>
			<lne id="60" begin="3" end="5"/>
			<lne id="61" begin="3" end="6"/>
			<lne id="62" begin="9" end="9"/>
			<lne id="63" begin="9" end="10"/>
			<lne id="64" begin="11" end="11"/>
			<lne id="65" begin="9" end="12"/>
			<lne id="66" begin="0" end="17"/>
			<lne id="67" begin="0" end="18"/>
			<lne id="68" begin="0" end="19"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="1" name="69" begin="8" end="16"/>
			<lve slot="0" name="17" begin="0" end="19"/>
		</localvariabletable>
	</operation>
	<operation name="70">
		<context type="6"/>
		<parameters>
		</parameters>
		<code>
			<push arg="50"/>
			<push arg="51"/>
			<findme/>
			<push arg="71"/>
			<call arg="72"/>
			<iterate/>
			<store arg="19"/>
			<getasm/>
			<get arg="1"/>
			<push arg="73"/>
			<push arg="8"/>
			<new/>
			<dup/>
			<push arg="43"/>
			<pcall arg="74"/>
			<dup/>
			<push arg="69"/>
			<load arg="19"/>
			<pcall arg="75"/>
			<dup/>
			<push arg="76"/>
			<push arg="77"/>
			<push arg="78"/>
			<new/>
			<pcall arg="79"/>
			<pusht/>
			<pcall arg="80"/>
			<enditerate/>
		</code>
		<linenumbertable>
			<lne id="81" begin="19" end="24"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="1" name="69" begin="6" end="26"/>
			<lve slot="0" name="17" begin="0" end="27"/>
		</localvariabletable>
	</operation>
	<operation name="82">
		<context type="6"/>
		<parameters>
			<parameter name="19" type="83"/>
		</parameters>
		<code>
			<load arg="19"/>
			<push arg="69"/>
			<call arg="84"/>
			<store arg="29"/>
			<load arg="19"/>
			<push arg="76"/>
			<call arg="85"/>
			<store arg="86"/>
			<load arg="86"/>
			<dup/>
			<getasm/>
			<load arg="29"/>
			<get arg="38"/>
			<call arg="30"/>
			<set arg="38"/>
			<pop/>
		</code>
		<linenumbertable>
			<lne id="87" begin="11" end="11"/>
			<lne id="88" begin="11" end="12"/>
			<lne id="89" begin="9" end="14"/>
			<lne id="81" begin="8" end="15"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="3" name="76" begin="7" end="15"/>
			<lve slot="2" name="69" begin="3" end="15"/>
			<lve slot="0" name="17" begin="0" end="15"/>
			<lve slot="1" name="90" begin="0" end="15"/>
		</localvariabletable>
	</operation>
	<operation name="91">
		<context type="6"/>
		<parameters>
		</parameters>
		<code>
			<push arg="92"/>
			<push arg="51"/>
			<findme/>
			<push arg="71"/>
			<call arg="72"/>
			<iterate/>
			<store arg="19"/>
			<getasm/>
			<get arg="1"/>
			<push arg="73"/>
			<push arg="8"/>
			<new/>
			<dup/>
			<push arg="46"/>
			<pcall arg="74"/>
			<dup/>
			<push arg="93"/>
			<load arg="19"/>
			<pcall arg="75"/>
			<dup/>
			<push arg="94"/>
			<push arg="95"/>
			<push arg="78"/>
			<new/>
			<pcall arg="79"/>
			<dup/>
			<push arg="96"/>
			<push arg="95"/>
			<push arg="78"/>
			<new/>
			<pcall arg="79"/>
			<pusht/>
			<pcall arg="80"/>
			<enditerate/>
		</code>
		<linenumbertable>
			<lne id="97" begin="19" end="24"/>
			<lne id="98" begin="25" end="30"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="1" name="93" begin="6" end="32"/>
			<lve slot="0" name="17" begin="0" end="33"/>
		</localvariabletable>
	</operation>
	<operation name="99">
		<context type="6"/>
		<parameters>
			<parameter name="19" type="83"/>
		</parameters>
		<code>
			<load arg="19"/>
			<push arg="93"/>
			<call arg="84"/>
			<store arg="29"/>
			<load arg="19"/>
			<push arg="94"/>
			<call arg="85"/>
			<store arg="86"/>
			<load arg="19"/>
			<push arg="96"/>
			<call arg="85"/>
			<store arg="100"/>
			<load arg="86"/>
			<dup/>
			<getasm/>
			<load arg="29"/>
			<get arg="38"/>
			<push arg="101"/>
			<call arg="102"/>
			<call arg="30"/>
			<set arg="38"/>
			<dup/>
			<getasm/>
			<pushi arg="19"/>
			<call arg="30"/>
			<set arg="103"/>
			<dup/>
			<getasm/>
			<load arg="29"/>
			<call arg="104"/>
			<call arg="30"/>
			<set arg="78"/>
			<pop/>
			<load arg="100"/>
			<dup/>
			<getasm/>
			<load arg="29"/>
			<get arg="38"/>
			<push arg="105"/>
			<call arg="102"/>
			<call arg="30"/>
			<set arg="38"/>
			<dup/>
			<getasm/>
			<pushi arg="54"/>
			<call arg="30"/>
			<set arg="103"/>
			<dup/>
			<getasm/>
			<load arg="29"/>
			<call arg="104"/>
			<call arg="30"/>
			<set arg="78"/>
			<pop/>
		</code>
		<linenumbertable>
			<lne id="106" begin="15" end="15"/>
			<lne id="107" begin="15" end="16"/>
			<lne id="108" begin="17" end="17"/>
			<lne id="109" begin="15" end="18"/>
			<lne id="110" begin="13" end="20"/>
			<lne id="111" begin="23" end="23"/>
			<lne id="112" begin="21" end="25"/>
			<lne id="113" begin="28" end="28"/>
			<lne id="114" begin="28" end="29"/>
			<lne id="115" begin="26" end="31"/>
			<lne id="97" begin="12" end="32"/>
			<lne id="116" begin="36" end="36"/>
			<lne id="117" begin="36" end="37"/>
			<lne id="118" begin="38" end="38"/>
			<lne id="119" begin="36" end="39"/>
			<lne id="120" begin="34" end="41"/>
			<lne id="121" begin="44" end="44"/>
			<lne id="122" begin="42" end="46"/>
			<lne id="123" begin="49" end="49"/>
			<lne id="124" begin="49" end="50"/>
			<lne id="125" begin="47" end="52"/>
			<lne id="98" begin="33" end="53"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="3" name="94" begin="7" end="53"/>
			<lve slot="4" name="96" begin="11" end="53"/>
			<lve slot="2" name="93" begin="3" end="53"/>
			<lve slot="0" name="17" begin="0" end="53"/>
			<lve slot="1" name="90" begin="0" end="53"/>
		</localvariabletable>
	</operation>
</asm>
