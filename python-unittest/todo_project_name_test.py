import unittest

class Hello():

  def hello(greeted):
      return "Hello " + greeted

class HelloTestCase(unittest.TestCase):

    def test_hello_world(self):
        self.assertEqual(Hello.hello("World!"), "Hello World!")
