defmodule Hello do
  @moduledoc """
  Documentation for Hello module.
  """

  @doc """
  Hello

  ## Examples

      iex> Hello.hello "doctest!"
      "Hello doctest!"

  """
  def hello(greeted) do
    "Hello " <> greeted
  end
end
