<tr class="noCover">
<td class="line"><a name='1'/>1</td>
<td class="hits"/>
<td class="code">package&nbsp;ken.kata.techtest.parser;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='2'/>2</td>
<td class="hits"/>
<td class="code"></td>
</tr>
<tr class="noCover">
<td class="line"><a name='3'/>3</td>
<td class="hits"/>
<td class="code">import&nbsp;ken.kata.techtest.Time;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='4'/>4</td>
<td class="hits"/>
<td class="code">import&nbsp;ken.kata.techtest.validator.Preconditions;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='5'/>5</td>
<td class="hits"/>
<td class="code"></td>
</tr>
<tr class="noCover">
<td class="line"><a name='6'/>6</td>
<td class="hits"/>
<td class="code">import&nbsp;java.util.regex.Matcher;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='7'/>7</td>
<td class="hits"/>
<td class="code">import&nbsp;java.util.regex.Pattern;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='8'/>8</td>
<td class="hits"/>
<td class="code"></td>
</tr>
<tr class="noCover">
<td class="line"><a name='9'/>9</td>
<td class="hits"/>
<td class="code">import&nbsp;static&nbsp;java.lang.Integer.parseInt;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='10'/>10</td>
<td class="hits"/>
<td class="code"></td>
</tr>
<tr class="noCover">
<td class="line"><a name='11'/>11</td>
<td class="hits"/>
<td class="code">public&nbsp;class&nbsp;BerlinClockParser&nbsp;implements&nbsp;Parser&nbsp;{</td>
</tr>
<tr class="noCover">
<td class="line"><a name='12'/>12</td>
<td class="hits"/>
<td class="code"></td>
</tr>
<tr class="noCover">
<td class="line"><a name='13'/>13</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;public&nbsp;static&nbsp;final&nbsp;String&nbsp;DEFAULT_PATTERN&nbsp;=&nbsp;"(\\d{2})::(\\d{2}):(\\d{2})";</td>
</tr>
<tr class="noCover">
<td class="line"><a name='14'/>14</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;private&nbsp;Pattern&nbsp;pattern;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='15'/>15</td>
<td class="hits"/>
<td class="code"></td>
</tr>
<tr class="coverFull">
<td class="line"><a name='16'/>16</td>
<td class="hits">11</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;public&nbsp;BerlinClockParser(String&nbsp;patternConfig)&nbsp;{</td>
</tr>
<tr class="coverFull">
<td class="line"><a name='17'/>17</td>
<td class="hits">11</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;pattern&nbsp;=&nbsp;Pattern.compile(patternConfig);</td>
</tr>
<tr class="coverFull">
<td class="line"><a name='18'/>18</td>
<td class="hits">11</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;}</td>
</tr>
<tr class="noCover">
<td class="line"><a name='19'/>19</td>
<td class="hits"/>
<td class="code"></td>
</tr>
<tr class="coverNone">
<td class="line"><a name='20'/>20</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;public&nbsp;BerlinClockParser()&nbsp;{</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='21'/>21</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;pattern&nbsp;=&nbsp;Pattern.compile(DEFAULT_PATTERN);</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='22'/>22</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;}</td>
</tr>
<tr class="noCover">
<td class="line"><a name='23'/>23</td>
<td class="hits"/>
<td class="code"></td>
</tr>
<tr class="noCover">
<td class="line"><a name='24'/>24</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;@Override</td>
</tr>
<tr class="noCover">
<td class="line"><a name='25'/>25</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;public&nbsp;Time&nbsp;parse(String&nbsp;time)&nbsp;{</td>
</tr>
<tr class="coverFull">
<td class="line"><a name='26'/>26</td>
<td class="hits">109</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Matcher&nbsp;matcher&nbsp;=&nbsp;pattern.matcher(time);</td>
</tr>
<tr class="noCover">
<td class="line"><a name='27'/>27</td>
<td class="hits"/>
<td class="code"></td>
</tr>
<tr class="coverFull">
<td class="line"><a name='28'/>28</td>
<td class="hits">109</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Preconditions.validate(matcher.find(),&nbsp;"Input&nbsp;string&nbsp;does&nbsp;not&nbsp;comply&nbsp;to&nbsp;hh::mm:ss");</td>
</tr>
<tr class="noCover">
<td class="line"><a name='29'/>29</td>
<td class="hits"/>
<td class="code"></td>
</tr>
<tr class="coverFull">
<td class="line"><a name='30'/>30</td>
<td class="hits">215</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;return&nbsp;new&nbsp;Time(</td>
</tr>
<tr class="coverFull">
<td class="line"><a name='31'/>31</td>
<td class="hits">108</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;parseInt(matcher.group(1)),</td>
</tr>
<tr class="coverFull">
<td class="line"><a name='32'/>32</td>
<td class="hits">107</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;parseInt(matcher.group(2)),</td>
</tr>
<tr class="coverFull">
<td class="line"><a name='33'/>33</td>
<td class="hits">108</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;parseInt(matcher.group(3)));</td>
</tr>
<tr class="noCover">
<td class="line"><a name='34'/>34</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;}</td>
</tr>
<tr class="noCover">
<td class="line"><a name='35'/>35</td>
<td class="hits"/>
<td class="code">}</td>
</tr>
