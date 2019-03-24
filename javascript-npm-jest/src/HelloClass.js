export default class {

  constructor(greeted){
    this.greeted = greeted
  }

  hello() {
    return 'Hello ' + this.greeted;
  }
}