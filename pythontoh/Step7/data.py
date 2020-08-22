bag = []
print(bag)

class Person:
    def display(self):
        print('this is person')

p = Person()
bag.append(p)
for fruit in bag:
    print(f"you got {fruit}")

print('done')


