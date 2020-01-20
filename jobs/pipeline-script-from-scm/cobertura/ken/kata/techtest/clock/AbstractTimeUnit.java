<tr class="noCover">
<td class="line"><a name='1'/>1</td>
<td class="hits"/>
<td class="code">package&nbsp;ken.kata.techtest.clock;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='2'/>2</td>
<td class="hits"/>
<td class="code"></td>
</tr>
<tr class="noCover">
<td class="line"><a name='3'/>3</td>
<td class="hits"/>
<td class="code">import&nbsp;ken.kata.techtest.validator.Precondition;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='4'/>4</td>
<td class="hits"/>
<td class="code"></td>
</tr>
<tr class="noCover">
<td class="line"><a name='5'/>5</td>
<td class="hits"/>
<td class="code">import&nbsp;java.util.List;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='6'/>6</td>
<td class="hits"/>
<td class="code"></td>
</tr>
<tr class="noCover">
<td class="line"><a name='7'/>7</td>
<td class="hits"/>
<td class="code">import&nbsp;static&nbsp;java.util.stream.Collectors.joining;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='8'/>8</td>
<td class="hits"/>
<td class="code"></td>
</tr>
<tr class="coverFull">
<td class="line"><a name='9'/>9</td>
<td class="hits">40</td>
<td class="code">public&nbsp;abstract&nbsp;class&nbsp;AbstractTimeUnit&nbsp;implements&nbsp;TimeUnit&nbsp;{</td>
</tr>
<tr class="noCover">
<td class="line"><a name='10'/>10</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;public&nbsp;static&nbsp;final&nbsp;String&nbsp;TIME_UNITS_PART_DELIMITER&nbsp;=&nbsp;"&nbsp;";</td>
</tr>
<tr class="noCover">
<td class="line"><a name='11'/>11</td>
<td class="hits"/>
<td class="code"></td>
</tr>
<tr class="noCover">
<td class="line"><a name='12'/>12</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;protected&nbsp;List&lt;?&nbsp;extends&nbsp;TimeUnit&gt;&nbsp;timeUnitParts;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='13'/>13</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;protected&nbsp;Precondition&nbsp;precondition;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='14'/>14</td>
<td class="hits"/>
<td class="code"></td>
</tr>
<tr class="noCover">
<td class="line"><a name='15'/>15</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;@Override</td>
</tr>
<tr class="noCover">
<td class="line"><a name='16'/>16</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;public&nbsp;String&nbsp;display(int&nbsp;units)&nbsp;{</td>
</tr>
<tr class="coverFull">
<td class="line"><a name='17'/>17</td>
<td class="hits">332</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;precondition.validate(units);</td>
</tr>
<tr class="noCover">
<td class="line"><a name='18'/>18</td>
<td class="hits"/>
<td class="code"></td>
</tr>
<tr class="coverFull">
<td class="line"><a name='19'/>19</td>
<td class="hits">659</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;return&nbsp;timeUnitParts.stream().</td>
</tr>
<tr class="coverFull">
<td class="line"><a name='20'/>20</td>
<td class="hits">882</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;map(timeUnitPart&nbsp;-&gt;&nbsp;timeUnitPart.display(units)).</td>
</tr>
<tr class="coverFull">
<td class="line"><a name='21'/>21</td>
<td class="hits">331</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;collect(joining(TIME_UNITS_PART_DELIMITER));</td>
</tr>
<tr class="noCover">
<td class="line"><a name='22'/>22</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;}</td>
</tr>
<tr class="noCover">
<td class="line"><a name='23'/>23</td>
<td class="hits"/>
<td class="code">}</td>
</tr>
