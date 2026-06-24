class Node{
    constructor(value){
      this.value = value
      this.next = null
    }
}

class LinkedList{
    constructor(){
       this.head = null
    }
    addNodeAtFirst(data){
        const newNode = new Node(data)
        newNode.next  = this.head
        this.head = newNode
    }
    addNodeAtLast(data){
        let crr = this.head
        while(crr.next){
            crr = crr.next
        }
        let newNode = new Node(data)
        crr.next = newNode;
        

    }
    insertAt(data,pos){
        let crr = this.head
        let index = 1
        while(crr.next && index != pos){
           crr = crr.next
           index++
        }
        let newNode = new Node(data)

        newNode.next = crr.next
        crr.next = newNode
    }
    print(){
        let crr = this.head
        let res = ""
        while(crr){
            res += crr.value + "->"
            crr = crr.next
        }
        console.log(res + "null")
    }
}
const n = new LinkedList()
n.addNodeAtFirst(45)
n.addNodeAtFirst(40)
n.print()
n.addNodeAtFirst(89)
n.addNodeAtLast(1)
n.insertAt(4,4)
n.print()