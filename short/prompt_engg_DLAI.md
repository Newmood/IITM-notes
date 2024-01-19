Also check out this [Prompting Guide](https://www.promptingguide.ai/)
## Contents:


Two types of LLMs:
- **Base LLM** : Predicts next word based on the large amount general of data available. Hence, often fails at providing desired outputs.
- **Instruction tuned LLM** : Further training and fine tuning on base LLM and often developed using RLHF, hence they are instruction tuned and produced way better outputs.

## Basic guidelines
### Write clear and specific instructions
1. Use delimiters
2. Ask for structured output (HTML, JSON etc) wherever applicable.
3. Ask model to check conditions : We can use make up if-else environment instructing the model what to do in each condition.
4. Few shot prompting : Write the input as form of example, and ask for output. Models perform well and provide output in the same format as a continuation of given input. [Also check few shot prompting from guide](https://www.promptingguide.ai/techniques/fewshot).

### Give the model time to think
Break down the task given to LLM in as many parts as possible to give clear instructions. Provide it with steps to reach a conclusion rather than just telling it to give conclusion.

### Limitations
Models often **hallucinate** (in a sense that they provide realistic information on fictitious things), we can reduce this by instructing it to carefully consider the information given in the prompt itself.

## Iterating
Imporve on the base prompt. The process is very important. For example once we get an output based on a prompt, we can do the following:
1. Limit length, mention number of words or sentences.
2. Tell it what details to focus on, what are the important part in the context.
3. Tell it to format the given text as required.

## Summarizing
1. Mention what to focus on while summarizing
2. Use words like "extract" instead of "summarize"

## Inference
1. Getting sentiment of reiews
2. For multiple reviews it is often useful to go through this process and getting inference and output as a JSON format.
3. Extract important points from a large pieces of text.

## Transforming



