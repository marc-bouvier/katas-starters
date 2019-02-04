defmodule FizzBuzzerTest do
  use ExUnit.Case

  # Exécution des tests décrits dans la documentation de la fonction
  doctest FizzBuzzer

  test "fizzbuzz de 1" do
    assert FizzBuzzer.fizzbuzz(1) == "1"
  end
end
