<html>
    <body>
        <h3>Details-Submission-Form</h3>
        <hr>
        <form action="TaxCalculator" method="get">
            <pre>
            Income  <input type="text" name="t1"/>
            Age     <input type="text" name="t2"/>
            PIN     <input type="password" name="t3"/>
                    <input type="hidden" name="t4" value="5555"/>
            City    <select name="t5">
                    <option value="DL">Delhi</option>
                    <option value="MB">Mumbai</option>
                    <option value="PN">Pune</option>
                    </select>
            Assets  <select name="t6" multiple="multiple">
                    <option>Plot</option>
                    <option>Flat</option>
                    <option>Car</option>
                    <option>Gold</option>
                    <option>Bunglow</option>
                    </select>        
            NRI     <input type="checkbox" name="t7" value="yes"/> [click to say yes you are nri]
                    <input type="submit" value="Find-Tax" />
            </pre>
        </form>
        <hr>
        <a href="index.jsp">Home</a>
    </body>
</html>

