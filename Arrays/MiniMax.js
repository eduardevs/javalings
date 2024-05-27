function miniMax(arr) {
    // 1) creating the sum combinations
    // AMELORATION : que le resultats rentre deja additioné 
    let results = [[], [], [], [], []];
    
    for(let i = 0; i < arr.length ;++i) {
        for(let j = 0; j < arr.length; ++j) {
            if(i != j) {
                results[i]+= arr[j];
            }
        }
    }

    // 2) Supplementaire :
    let finalResults = [];
    for(let i = 0; i < arr.length; ++i) {
        finalResults.push(results[i].split('').reduce(getSum, 0));
    }

    //console.log(finalResults)
    // LinearSearch
    // 3) find max and min
    let max = finalResults[0];
    let min = finalResults[0];
    
    for(let i = 0; i < finalResults.length; ++i) {
        if(min > finalResults[i]) {
            min = finalResults[i];
        }
        
        if(max < finalResults[i]) {
            max = finalResults[i];
        }
    }

   // let test = results[0].split('');
   // console.log(test);
    //console.log(test.reduce(getSum, 0));
    console.log(min, max);
}

function getSum(total, num) {
    return total += Math.round(num);
}

let test = [1,2,3,4,5] // 10, 14
let test2 = [4,2,5,1,6] // 12, 17
let test3 = [5,2,1,4]; // 7, 11
let test4 = [2,1,3]; // 3, 5

miniMax(test4);


// TIME COMPLEXITY, O()