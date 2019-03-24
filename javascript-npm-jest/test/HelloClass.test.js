import Hello from '../src/HelloClass';

test ('Hello.hello("World!") devrait retourner "Hello World!"', () => {
  const h = new Hello("World!")
  expect (h.hello()).toBe ('Hello World!');
});