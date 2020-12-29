function calculate(){
    basicSalary = parseInt(document.getElementById("basic").value);
    salaryOperations.inputSalary(basicSalary);
    document.getElementById("hra").innerText = salaryOperations.hra();
}