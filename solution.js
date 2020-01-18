// const n = '123';
// console.log(n.toString())
// for (var i=0; i<n.length; n++ ) {
    // const x = 2;
    // 'a'.charCodeAt()
    // console.log()
    // console.log('2'.charCodeAt(0))
// console.log('123'.codePointAt(0)+ 15)

const n = '123';
const map = {
    '1':'A', '2':'B', '3':'C', '4':'D', '5':'E'
}
// const final = [];
// let first = '';
// for (var i=0; i<n.length; i++ ) {
//     first+= map[n[i]];
    // if(parseInt(n[i]) )
    // let x = map[n[i]];
    // console.log(x)
    // let x = n.split('').toString();
    // for(var j=0; j< x.length; j ++){
    //     console.log(x[j])
    // }
    // console.log(x)
// }
// console.log(first)
// console.log(n.split(''))
let final = [];
let order = n.split('');
let x = 1;
const rep = (order, final) => {
    let word = '';
    for (var i=0; i<order.length; i++){
        word += map[order[i]];
    }
    final.push(word);
    x++;
    let newOrder = 
    rep([order.slice(0,x).join(''), order.slice(x)], final)
    return final;
}
rep(order);
console.log(final)

