/**
 * @param {integer} init
 * @return { increment: Function, decrement: Function, reset: Function }
 */
var createCounter = function(init) {
    let ans=init;
    return {
        increment:()=>{
            return ++ans;
        },
        decrement:()=>{
            return --ans;
        },
        reset:()=>{
            return ans=init;
        }
    }
};

/**
 * const counter = createCounter(5)
 * counter.increment(); // 6
 * counter.reset(); // 5
 * counter.decrement(); // 4
 */