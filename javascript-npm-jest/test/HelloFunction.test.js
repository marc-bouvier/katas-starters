import hello from '../src/HelloFunction';

test ('hello ("World!") devrait retourner "Hello World!"', () => {
  expect (hello ("World!")).toBe ('Hello World!');
});