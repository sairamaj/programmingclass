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
        small  = Disk(4)
        towerA.add_disk(small)

        medium  = Disk(8)
        towerA.add_disk(medium)

        large  = Disk(12)
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



