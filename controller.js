window.addEventListener("load", init);
function init(){
    bindEvents();
}
function bindEvents(){
    document.getElementById("add").addEventListener("click", addRecord);
    document.getElementById("print").addEventListener("click", printTable);
    document.getElementById("sort").addEventListener("click", sortItems);

}
function addRecord(){
    var item = new Item();
    for(let key in item){
        item[key] = document.getElementById(key).value;
    }
    itemOperations.add(item);
}
function printTable(){
    var tbody = document.getElementById(items);
    tbody.innerText = "";
    itemOperations.items.forEach(item=>printRecord(item));
}
function printRecord(item){
    var tbody = document.getElementById(items);
    var tr = tbody.insertRow();
    for(let key in item){
        let cell = tr.insertCell();
        cell.innerText = item[key];
    } 
}
function sortItems(){
    itemOperations.items = itemOperations.sortbyPrice();
    printTable();
}