<tr class="noCover">
<td class="line"><a name='1'/>1</td>
<td class="hits"/>
<td class="code">package&nbsp;ken.kata.techtest;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='2'/>2</td>
<td class="hits"/>
<td class="code"></td>
</tr>
<tr class="noCover">
<td class="line"><a name='3'/>3</td>
<td class="hits"/>
<td class="code">import&nbsp;ken.kata.techtest.clock.hours.Hours;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='4'/>4</td>
<td class="hits"/>
<td class="code">import&nbsp;ken.kata.techtest.clock.minutes.Minutes;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='5'/>5</td>
<td class="hits"/>
<td class="code">import&nbsp;ken.kata.techtest.clock.seconds.Seconds;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='6'/>6</td>
<td class="hits"/>
<td class="code">import&nbsp;ken.kata.techtest.parser.Parser;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='7'/>7</td>
<td class="hits"/>
<td class="code">import&nbsp;ken.kata.techtest.validator.Preconditions;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='8'/>8</td>
<td class="hits"/>
<td class="code"></td>
</tr>
<tr class="noCover">
<td class="line"><a name='9'/>9</td>
<td class="hits"/>
<td class="code">public&nbsp;class&nbsp;BerlinClockImpl&nbsp;implements&nbsp;BerlinClock&nbsp;{</td>
</tr>
<tr class="noCover">
<td class="line"><a name='10'/>10</td>
<td class="hits"/>
<td class="code"></td>
</tr>
<tr class="noCover">
<td class="line"><a name='11'/>11</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;public&nbsp;static&nbsp;final&nbsp;String&nbsp;TIME_UNIT_DELIMITER&nbsp;=&nbsp;"&nbsp;";</td>
</tr>
<tr class="noCover">
<td class="line"><a name='12'/>12</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;public&nbsp;static&nbsp;final&nbsp;int&nbsp;MAX_SIZE&nbsp;=&nbsp;28;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='13'/>13</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;private&nbsp;Parser&nbsp;parser;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='14'/>14</td>
<td class="hits"/>
<td class="code"></td>
</tr>
<tr class="coverFull">
<td class="line"><a name='15'/>15</td>
<td class="hits">9</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;private&nbsp;Hours&nbsp;hours&nbsp;=&nbsp;new&nbsp;Hours();</td>
</tr>
<tr class="coverFull">
<td class="line"><a name='16'/>16</td>
<td class="hits">9</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;private&nbsp;Minutes&nbsp;minutes&nbsp;=&nbsp;new&nbsp;Minutes();</td>
</tr>
<tr class="coverFull">
<td class="line"><a name='17'/>17</td>
<td class="hits">9</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;private&nbsp;Seconds&nbsp;seconds&nbsp;=&nbsp;new&nbsp;Seconds();</td>
</tr>
<tr class="noCover">
<td class="line"><a name='18'/>18</td>
<td class="hits"/>
<td class="code"></td>
</tr>
<tr class="coverFull">
<td class="line"><a name='19'/>19</td>
<td class="hits">9</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;public&nbsp;BerlinClockImpl(Parser&nbsp;parser)&nbsp;{</td>
</tr>
<tr class="coverFull">
<td class="line"><a name='20'/>20</td>
<td class="hits">9</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;this.parser&nbsp;=&nbsp;parser;</td>
</tr>
<tr class="coverFull">
<td class="line"><a name='21'/>21</td>
<td class="hits">9</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;}</td>
</tr>
<tr class="noCover">
<td class="line"><a name='22'/>22</td>
<td class="hits"/>
<td class="code"></td>
</tr>
<tr class="noCover">
<td class="line"><a name='23'/>23</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;@Override</td>
</tr>
<tr class="noCover">
<td class="line"><a name='24'/>24</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;public&nbsp;String&nbsp;displayTime(String&nbsp;input)&nbsp;{</td>
</tr>
<tr class="coverFull">
<td class="line"><a name='25'/>25</td>
<td class="hits">108</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Preconditions.validate(input&nbsp;!=&nbsp;null,&nbsp;"Input&nbsp;string&nbsp;is&nbsp;null");</td>
</tr>
<tr class="noCover">
<td class="line"><a name='26'/>26</td>
<td class="hits"/>
<td class="code"></td>
</tr>
<tr class="coverFull">
<td class="line"><a name='27'/>27</td>
<td class="hits">107</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Time&nbsp;time&nbsp;=&nbsp;parser.parse(input);</td>
</tr>
<tr class="noCover">
<td class="line"><a name='28'/>28</td>
<td class="hits"/>
<td class="code"></td>
</tr>
<tr class="coverFull">
<td class="line"><a name='29'/>29</td>
<td class="hits">214</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;return&nbsp;new&nbsp;StringBuilder(MAX_SIZE).</td>
</tr>
<tr class="coverFull">
<td class="line"><a name='30'/>30</td>
<td class="hits">107</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;append(seconds.display(time.seconds)).append(TIME_UNIT_DELIMITER).</td>
</tr>
<tr class="coverFull">
<td class="line"><a name='31'/>31</td>
<td class="hits">105</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;append(hours.display(time.hours)).append(TIME_UNIT_DELIMITER).</td>
</tr>
<tr class="coverFull">
<td class="line"><a name='32'/>32</td>
<td class="hits">107</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;append(minutes.display(time.minutes)).toString();</td>
</tr>
<tr class="noCover">
<td class="line"><a name='33'/>33</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;}</td>
</tr>
<tr class="noCover">
<td class="line"><a name='34'/>34</td>
<td class="hits"/>
<td class="code">}</td>
</tr>
