
from gamer import Gamer

# construcing gamer object
# this will create 3 towers and draw then
gamer = Gamer()
gamer.draw()

# ask the user from which tower to which tower
# move gamer

keep_continue = True

while keep_continue:
    command = input("please enter command:")
    
    if command == 'quit':
        keep_continue = False
    elif command == 'move':
        from_tower = input('from which tower:')
        to_tower = input('to which tower:')
        
        from_tower_int = int(from_tower)
        to_tower_int = int(to_tower)

        try:
            gamer.move(from_tower_int, to_tower_int)
        except ValueError as e:
            print(f"    Error:{e}")

    else:
        print("invalid command(either enter move or quit")

print('bye')


