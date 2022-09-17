function retrieveData(){
    var obj = sessionStorage.getItem("obj");
    if(obj==null){
        document.getElementById("out").innerHTML="Record not present"
    }else {
        // let pTag1 = document.createElement("H6");
        //     let ptTagValue1 = document.createTextNode(" | CLIENT NAME | PROJECT NAME | BUDGET | ");
        //     pTag1.appendChild(ptTagValue1);
        //     document.getElementById("result").appendChild(pTag1);

        var h1 = document.createElement("TH");
        var m = document.createTextNode("CLIENT NAME");           
        h1.appendChild(m);             
        document.getElementById("myTable").appendChild(h1);
        var h2 = document.createElement("TH");
        var n = document.createTextNode("PROJECT NAME");           
        h2.appendChild(n);             
        document.getElementById("myTable").appendChild(h2);
        var h3 = document.createElement("TH");
        var o = document.createTextNode("BUDGET");           
        h3.appendChild(o);             
        document.getElementById("myTable").appendChild(h3);
        var h4 = document.createElement("TH");
        var f = document.createTextNode("Expense");           
        h4.appendChild(f); 
        document.getElementById("myTable").appendChild(h4);
        let proData = JSON.parse(obj);
        for(let i =0;i<proData.length;i++){
        //     let pTag = document.createElement("p");
        //     let ptTagValue = document.createTextNode("  "+proData[i].clientname+"   "+proData[i].projectname+"   "+proData[i].bud);
        //     pTag.appendChild(ptTagValue);
        //     document.getElementById("result").appendChild(pTag);

            
             /* Create tr element */
            var x = document.createElement("TR");
             
            // /* Set the id attribute */
            // x.setAttribute("id", "rowTr");
             
            /* Append element to table */
            document.getElementById("myTable").appendChild(x);
             
            /* Create td element */
            var y = document.createElement("TD");
             
            var t = document.createTextNode(proData[i].clientname);
             
            y.appendChild(t);
             
            document.getElementById("myTable").appendChild(y);
             
            /* Create td element */
            var z = document.createElement("TD");
             
            /* Assign node value */
            var p = document.createTextNode(proData[i].projectname);
             
            /* Append node value to child element */
            z.appendChild(p);
             
            document.getElementById("myTable").appendChild(z);

            var q = document.createElement("TD");
             
            var w = document.createTextNode(proData[i].bud);
             
            q.appendChild(w);
             
            document.getElementById("myTable").appendChild(q);
            var r = document.createElement("TD");
             
            var s = document.createTextNode(proData[i].exp);
             
            r.appendChild(s);
             
            document.getElementById("myTable").appendChild(r);
            }
        

    }  
}
