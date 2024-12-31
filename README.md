# Kotlin removeIf Function Unexpected Behavior

This repository demonstrates an uncommon and potentially confusing behavior of the `removeIf` function in Kotlin when used with different collection types (Lists, Sets, Maps). Specifically, it highlights how concurrency and mutability impact the function's outcome.

## Bug Description

The `removeIf` function, while generally straightforward, can exhibit unexpected behavior if not used with a full understanding of Kotlin's collection implementations and mutability.

## How to Reproduce

1. Clone this repository.
2. Open `bug.kt`.
3. Run the code.  Observe the outputs.  The outputs might differ from expected results based on assumptions about how `removeIf` interacts with iterators.

## Solution

The solution provided in `bugSolution.kt` avoids the potential issues, usually by ensuring iteration occurs on a copy to avoid modification during iteration or by using safer alternatives.

## Contribution

Feel free to submit issues, improvements, or other edge-case examples that demonstrate unexpected behavior of Kotlin's `removeIf`.