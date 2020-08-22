from tower import Tower
from disk import Disk


class Gamer:
    # constructor called during Gamer()
    def __init__(self):

        # we create bag for towers
        self.towers_bag = []

        # create
        towerA = Tower("Tower-A")

        # create disk
        small = Disk(4)
        towerA.add_disk(small)

        medium = Disk(8)
        towerA.add_disk(medium)

        large = Disk(12)
        towerA.add_disk(large)

        # put towerA in the bag
        self.towers_bag.append(towerA)

        towerB = Tower("Tower-B")
        # put towerB in the bag
        self.towers_bag.append(towerB)

        towerC = Tower("Tower-C")
        # put towerC in the bag
        self.towers_bag.append(towerC)

    def draw(self):
        # draw the towers from bag.
        for tower in self.towers_bag:
            tower.draw()

    def move(self, from_tower, to_tower):
        # validate the input
        if from_tower < 1 or from_tower >3:
            raise  ValueError(f"from tower: {from_tower} should be between 1 and 3")
        
        if to_tower < 1 or to_tower >3:
            raise ValueError(f"to tower: {to_tower} should be between 1 and 3")

        # in program world the list indexes starts with 0
        # For user the towers are 1,2,3 and hence we will be reducing by 1 for whatever user entered.        
        from_tower = from_tower-1
        to_tower = to_tower-1
        
        # get towers from the bag (list)
        towerFrom = self.towers_bag[from_tower]
        towerTo = self.towers_bag[to_tower]

        # Move (remove a disk from tower, and add to tower )
        disk = towerFrom.remove_disk()
        towerTo.add_disk(disk)

        # we are redrwing to show the new towers with disk
        self.draw()
