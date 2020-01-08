<tr class="noCover">
<td class="line"><a name='1'/>1</td>
<td class="hits"/>
<td class="code">package&nbsp;ken.kata.techtest.clock.hours;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='2'/>2</td>
<td class="hits"/>
<td class="code"></td>
</tr>
<tr class="noCover">
<td class="line"><a name='3'/>3</td>
<td class="hits"/>
<td class="code">import&nbsp;ken.kata.techtest.clock.AbstractTimeUnit;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='4'/>4</td>
<td class="hits"/>
<td class="code">import&nbsp;ken.kata.techtest.clock.TimeUnit;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='5'/>5</td>
<td class="hits"/>
<td class="code">import&nbsp;ken.kata.techtest.validator.Precondition;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='6'/>6</td>
<td class="hits"/>
<td class="code"></td>
</tr>
<tr class="noCover">
<td class="line"><a name='7'/>7</td>
<td class="hits"/>
<td class="code">public&nbsp;class&nbsp;Hours&nbsp;extends&nbsp;AbstractTimeUnit&nbsp;implements&nbsp;TimeUnit&nbsp;{</td>
</tr>
<tr class="coverFull">
<td class="line"><a name='8'/>8</td>
<td class="hits">14</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;public&nbsp;Hours()&nbsp;{</td>
</tr>
<tr class="coverFull">
<td class="line"><a name='9'/>9</td>
<td class="hits">14</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;timeUnitParts&nbsp;=&nbsp;HoursFactory.createParts();</td>
</tr>
<tr class="coverFull">
<td class="line"><a name='10'/>10</td>
<td class="hits">14</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;precondition&nbsp;=&nbsp;new&nbsp;Precondition(</td>
</tr>
<tr class="coverPart" title="Line 11: Conditional coverage 75% (3/4)">
<td class="line"><a name='11'/>11</td>
<td class="hits">112</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;(units)&nbsp;-&gt;&nbsp;units&nbsp;&gt;=&nbsp;1&nbsp;&amp;&amp;&nbsp;units&nbsp;&lt;=&nbsp;24,</td>
</tr>
<tr class="noCover">
<td class="line"><a name='12'/>12</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"Hour&nbsp;units&nbsp;must&nbsp;be&nbsp;in&nbsp;range:&nbsp;units&nbsp;&gt;=&nbsp;1&nbsp;&amp;&amp;&nbsp;units&nbsp;&lt;=&nbsp;24");</td>
</tr>
<tr class="coverFull">
<td class="line"><a name='13'/>13</td>
<td class="hits">14</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;}</td>
</tr>
<tr class="noCover">
<td class="line"><a name='14'/>14</td>
<td class="hits"/>
<td class="code">}</td>
</tr>
