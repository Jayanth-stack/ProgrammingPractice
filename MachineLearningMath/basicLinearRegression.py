## Basic Linear Regression Model
## This is a simple linear regression model that predicts test scores based on the number of hours studied.
## The model is trained on a small dataset with 5 data points and tested on a single data point.
## The model is then saved to a file and loaded back to make predictions.

import pandas as pd
from sklearn.model_selection import train_test_split
from sklearn.linear_model import LinearRegression
import matplotlib.pyplot as plt

# Load the data

data = {
    'Hours Studied': [1.5, 3.0, 4.5,6.0, 7.5],
    'Test Score': [60, 70, 80, 90, 100]
}
df = pd.DataFrame(data)

x = df[['Hours Studied']]
y = df['Test Score']

# Split the data into training and test sets

X_train, X_test, y_train, y_test = train_test_split(x, y, test_size=0.2, random_state=0)

# Train the model

model = LinearRegression
model.fit(X_train, y_train)

# Make predictions

y_pred = model.predict(X_test)

# Visualize the model

plt.scatter(X_train, y_train, color='blue')
plt.plot(X_train, model.predict(X_train), color = 'red')
plt.title('Test Score vs Hours Studied')
plt.xlabel('Hours Studied')
plt.ylabel('Test Score')
plt.show()

# Evaluate the model

from sklearn.metrics import mean_squared_error

print(f'Mean Squared Error: {mean_squared_error(y_test, y_pred)}')

# Predict the test score for a student who studies for 5 hours

hours_studied = [[5]]
test_score = model.predict(hours_studied)
print(f'Test score prediction for 5 hours of studying: {test_score[0]}')

# Save the model

import joblib 

joblib.dump(model, 'linear_regression_model.pkl')

# Load the model

model = joblib.load('linear_regression_model.pkl')
test_score = model.predict(hours_studied)
print(f'Test score prediction for 5 hours of studying: {test_score[0]}')
