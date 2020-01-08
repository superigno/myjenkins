<tr class="noCover">
<td class="line"><a name='1'/>1</td>
<td class="hits"/>
<td class="code">package&nbsp;ken.kata.techtest.validator;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='2'/>2</td>
<td class="hits"/>
<td class="code"></td>
</tr>
<tr class="coverNone">
<td class="line"><a name='3'/>3</td>
<td class="hits">0</td>
<td class="code">public&nbsp;class&nbsp;Preconditions&nbsp;{</td>
</tr>
<tr class="noCover">
<td class="line"><a name='4'/>4</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;public&nbsp;static&nbsp;void&nbsp;validate(boolean&nbsp;condition,&nbsp;String&nbsp;message)&nbsp;{</td>
</tr>
<tr class="coverFull">
<td class="line"><a name='5'/>5</td>
<td class="hits">217</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;if&nbsp;(!condition)&nbsp;throw&nbsp;new&nbsp;IllegalArgumentException(message);</td>
</tr>
<tr class="coverFull">
<td class="line"><a name='6'/>6</td>
<td class="hits">215</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;}</td>
</tr>
<tr class="noCover">
<td class="line"><a name='7'/>7</td>
<td class="hits"/>
<td class="code">}</td>
</tr>
