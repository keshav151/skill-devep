const itemOperations = {
    items:[],
    add(itemObject){
        this.items.push(itemObject);
    },
    sortbyPrice(){
        return this.items.sort((a,b)=>a.price - b.price);
    }
}