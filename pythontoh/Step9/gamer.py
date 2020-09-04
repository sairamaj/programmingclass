from tower import Tower
from disk import Disk
from colorama import Fore, Back, Style


class Gamer:
    # constructor called during Gamer()
    def __init__(self):

        self.move_count = 0  # introduce move count
        # we create bag for towers
        self.towers_bag = []

        # create
        towerA = Tower("Tower-A")

        # create disk
        large = Disk(12, Fore.BLUE)
        towerA.add_disk(large)

        medium = Disk(8, Fore.RED)
        towerA.add_disk(medium)

        small = Disk(4, Fore.GREEN)
        towerA.add_disk(small)

        # put towerA in the bag
        self.towers_bag.append(towerA)

        towerB = Tower("Tower-B")
        # put towerB in the bag
        self.towers_bag.append(towerB)

        towerC = Tower("Tower-C")
        # put towerC in the bag
        self.towers_bag.append(towerC)

    def get_move_count(self):
        return self.move_count

    def draw(self):
        # draw the towers from bag.
        for tower in self.towers_bag:
            tower.draw()

    def move(self, from_tower, to_tower):

        self.move_count = self.move_count+1
        # validate the input
        if from_tower < 1 or from_tower > 3:
            raise ValueError(
                f"from tower: {from_tower} should be between 1 and 3")

        if to_tower < 1 or to_tower > 3:
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
        try:
            towerTo.add_disk(disk)
        except ValueError as e:
            towerFrom.add_disk(disk)    # put back to the original tower
            self.draw()
            raise

        # we are redrwing to show the new towers with disk
        self.draw()

        # get 2nd tower disk count
        if self.towers_bag[1].get_numberof_disks() == 3:
            return True  # we are done with game
        if self.towers_bag[2].get_numberof_disks() == 3:
            return True  # we are done with game

        return False
