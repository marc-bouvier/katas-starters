defmodule HelloTest do
  use ExUnit.Case

  # Exécution des tests décrits dans la documentation de la fonction
  doctest Hello

  test "hello de world" do
    assert Hello.hello("World!") == "Hello World!"
  end
end
