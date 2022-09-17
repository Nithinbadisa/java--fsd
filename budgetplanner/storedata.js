var proInfo;
function addData(){
    var client = document.getElementById("name").value;
    var project = document.getElementById("pro").value;
    var budget = document.getElementById("bud").value;
    var Expense=document.getElementById("exp").value;
    var obj = sessionStorage.getItem("obj");
    let info = {clientname:client,projectname:project,bud:budget,exp:Expense};
    if(obj==null){
        proInfo = new Array();
        proInfo.push(info);
        sessionStorage.setItem("obj",JSON.stringify(proInfo));
    }else {
        obj = JSON.parse(obj);
        obj.push(info);
        sessionStorage.setItem("obj",JSON.stringify(obj));
    }
    document.getElementById("name").value=""
    document.getElementById("pro").value=""
    document.getElementById("bud").value=""
    document.getElementById("exp").value=""
    document.getElementById("out").innerHTML="Data Added.."
}
