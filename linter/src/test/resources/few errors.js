function zadd1(a,b,z) {
  var ones, zf;
  zf = or(or(and(a,b), and(b,z)), and(a,z))

  j = or(a, nor(b,z));
  l = or(z, nor(a,b))

  console.log("jkl", j, k, l);

  ones = xor(j, xor(k, l));
  return {ones, zf}}

  function not(a) {
    if (a === 0)
      return 1
    else
      return 0
  }